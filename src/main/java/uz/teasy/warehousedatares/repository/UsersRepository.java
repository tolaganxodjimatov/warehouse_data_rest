package uz.teasy.warehousedatares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.teasy.warehousedatares.entity.Users;

import uz.teasy.warehousedatares.projection.CustomUsers;

@RepositoryRestResource(path = "users",collectionResourceRel = "list",excerptProjection = CustomUsers.class)
public interface UsersRepository extends JpaRepository<Users, Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
}
