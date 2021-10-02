package com.example.calendar.model

import org.hibernate.envers.AuditOverride
import org.hibernate.envers.Audited
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.OneToOne
import javax.validation.constraints.FutureOrPresent
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Entity
@Audited
@AuditOverride(forClass = BaseEntity::class)
class Event(
    @OneToOne(fetch = FetchType.EAGER)
    val owner: User,

    @NotBlank
    @Size(min = 3, max = 64)
    val title: String,

    @FutureOrPresent
    val start: LocalDateTime,
) : BaseEntity() { }