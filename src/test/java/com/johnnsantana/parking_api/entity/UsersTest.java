package com.johnnsantana.parking_api.entity;


import com.johnnsantana.parking_api.entity.user.RoleUser;
import com.johnnsantana.parking_api.entity.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class UsersTest {

    @Test
    public void givenAValidParams_whenCallNewUser_thenInstantiateAUser() {
        final var username = "aemail@gmail.com";
        final var password = "123456";
        RoleUser admin = RoleUser.ROLE_ADMIN;
        RoleUser client = RoleUser.ROLE_CLIENT;
        LocalDateTime createdAt = LocalDateTime.now();
        LocalDateTime updatedAt = LocalDateTime.now();
        final var createdBy = "aAdmin";
        final var modifiedBy = "aAdmin";

        final var actualUser = new User(1L, username, password, admin, createdAt, updatedAt, createdBy, modifiedBy);
        final var actualUserRoleClient = new User(1L, username, password, client, createdAt, updatedAt, createdBy, modifiedBy);

        Assertions.assertNotNull(actualUser);
        Assertions.assertNotNull(actualUserRoleClient);
        Assertions.assertNotNull(actualUser.getId());

        Assertions.assertEquals(username, actualUser.getUsername());
        Assertions.assertEquals(password, actualUser.getPassword());
        Assertions.assertEquals(admin, actualUser.getRole());

        Assertions.assertNotNull(actualUser.getCreatedAt());
        Assertions.assertNotNull(actualUser.getUpdatedAt());

        Assertions.assertEquals(createdBy, actualUser.getCreatedBy());
        Assertions.assertEquals(modifiedBy, actualUser.getModifiedBy());

    }



}
