package com.fastcode.sampleapplication14.domain.core.authorization.userspermission;

import javax.persistence.*;
import java.time.*;
import com.fastcode.sampleapplication14.domain.core.authorization.permission.Permission;
import com.fastcode.sampleapplication14.domain.core.authorization.users.Users;
import com.fastcode.sampleapplication14.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.querydsl.core.annotations.Config;

@Entity
@Config(defaultVariableName = "userspermissionEntity")
@Table(name = "userspermission")
@IdClass(UserspermissionId.class)
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Userspermission extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "permission_id", nullable = false)
    private Long permissionId;
    
    @Basic
    @Column(name = "revoked", nullable = true)
    private Boolean revoked;
    
    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "users_id", nullable = false)
    private Long usersId;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "permission_id", insertable=false, updatable=false)
    private Permission permission;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "users_id", insertable=false, updatable=false)
    private Users users;


}



