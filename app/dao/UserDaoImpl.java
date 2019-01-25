package dao;

import models.User;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao{

    final JPAApi jpaApi;

    @Inject
    public UserDaoImpl(JPAApi jpaApi) {

        this.jpaApi = jpaApi;
    }

    @Override
    public User create(User user) {

        if(null == user) {
            throw new IllegalArgumentException("User details must be provided");
        }

        jpaApi.em().persist(user);
        return user;
    }

    @Override
    public Optional<User> read(String name) {

        if(null == name){
            throw new IllegalArgumentException("name must be provided");
        }

        final User user = jpaApi.em().find(User.class, name);
        return user != null ? Optional.of(user) : Optional.empty();
    }

    @Override
    public User update(User user) {

        if(null == user) {
            throw new IllegalArgumentException("User must be provided");
        }

        if(null == user.getName()){
            throw new IllegalArgumentException("User Id must be provided");
        }

        final User existingUser = jpaApi.em().find(User.class, user.getName());

        if(null == existingUser) {
            return null;
        }

        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());

        jpaApi.em().persist(existingUser);

        return existingUser;
    }

    @Override
    public User delete(String name) {
        if(null == name) {
            throw new IllegalArgumentException("User name must be provided");
        }

        final User existingUser = jpaApi.em().find(User.class, name);
        if(null == existingUser) {
            return null;
        }

        jpaApi.em().remove(existingUser);
        return existingUser;
    }

    @Override
    public Collection<User> all() {

        TypedQuery<User> query = jpaApi.em().createQuery("SELECT u FROM User u", User.class);
        List<User> userList = query.getResultList();

        return userList;
    }

    @Override
    public Collection<User> createUsers(Collection<User> users) {
        for(User item: users){
            jpaApi.em().persist(item);
        }
        return users;
    }
}
