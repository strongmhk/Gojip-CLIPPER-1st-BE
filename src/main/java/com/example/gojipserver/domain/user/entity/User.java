package com.example.gojipserver.domain.user.entity;

import com.example.gojipserver.domain.checklist.entity.CheckList;
import com.example.gojipserver.global.auditing.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Table(name = "users")
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id")
    private Long id;

    @OneToMany(mappedBy = "user")
    private List<CheckList> checkLists = new ArrayList<>();

    private String email;
    private String nickname;
    private LocalDate birthday;
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Role role;
    private String refreshToken;

    public void update(String email,String nickname) {
        this.email = email;
        this.nickname = nickname;
    }

}
