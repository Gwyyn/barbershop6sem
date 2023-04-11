package com.barbershop.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
@Getter
public enum Role implements GrantedAuthority {
    ADMIN("Администратор"),
    MASTER("Парикмахер"),
    CLIENT("Клиент");

    private final String name;

    @Override
    public String getAuthority() {
        return name();
    }
}

