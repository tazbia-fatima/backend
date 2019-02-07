package dao;


import models.Profile;
import play.db.jpa.JPAApi;
import play.libs.F;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ProfileDaoImpl implements ProfileDao {

    final JPAApi jpaApi;

    @Inject
    public ProfileDaoImpl(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    public Profile create(Profile profile) {

        if (null == profile) {
            throw new IllegalArgumentException("Profile must be provided");
        }

        jpaApi.em().persist(profile);
        return profile;
    }

    public Optional<Profile> read(String name) {

        if (null == name) {
            throw new IllegalArgumentException("name must be provided");
        }

        final Profile profile = jpaApi.em().find(Profile.class, name);
        return profile != null ? Optional.of(profile) : Optional.empty();

    }

    public Profile update(Profile profile) {

        if (null == profile) {
            throw new IllegalArgumentException("Profile must be provided");
        }

        if (null == profile.getName()) {
            throw new IllegalArgumentException("Profile Name must be provided");
        }

        final Profile existingProfile = jpaApi.em().find(Profile.class, profile.getName());
        if (null == existingProfile) {
            return null;
        }

        existingProfile.setAge(profile.getAge());
        existingProfile.setHeight(profile.getHeight());
        existingProfile.setWeight(profile.getWeight());
        existingProfile.setOrientation(profile.getOrientation());

        jpaApi.em().persist(existingProfile);

        return existingProfile;
    }

    public Profile delete(String name) {

        if (null == name) {
            throw new IllegalArgumentException("Profile Id must be provided");
        }

        final Profile existingProfile = jpaApi.em().find(Profile.class, name);
        if (null == existingProfile) {
            return null;
        }

        jpaApi.em().remove(existingProfile);
        return existingProfile;

    }

    public Collection<Profile> all() {

        throw new NotImplementedException();
    }


}