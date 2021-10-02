package com.example.calendar.model

import org.hibernate.envers.AuditOverride
import org.hibernate.envers.Audited
import javax.persistence.Column
import javax.persistence.Entity
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Entity
@Audited
@AuditOverride(name = "id", forClass = BaseEntity::class)
class User(
    @NotBlank
    @Size(min = 6, max = 64)
    @Column(length = 64)
    val username: String,

    @Size(min = 6, max = 64)
    @Column(length = 64)
    val status: String,

    val password: String?,
) : BaseEntity() { }