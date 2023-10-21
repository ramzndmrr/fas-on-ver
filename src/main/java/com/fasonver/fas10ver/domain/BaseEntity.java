package com.fasonver.fas10ver.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.*;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
    @SequenceGenerator(name = "id_sequence", sequenceName = "id_sequence", allocationSize = 1)
    @Column(name = "id", precision = 18)
    protected Long id;

    @JsonIgnore
    @CreatedDate
    @Column(name = "kayit_zamani", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date kayitZamani;

    @JsonIgnore
    @LastModifiedDate
    @Column(name = "guncelleme_zamani")
    @Temporal(TemporalType.TIMESTAMP)
    private Date guncellemeZamani;

    @Column(name = "aktif", nullable = false)
    private Boolean aktif = Boolean.TRUE;

    @JsonIgnore
    @Version
    @Column(name = "version", precision = 9)
    private Integer version = 0;

    @JsonIgnore
    @Column(name = "uuid", updatable = false)
    private String uuid = java.util.UUID.randomUUID().toString();


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }

        BaseEntity other = (BaseEntity) obj;
        if (id != null && other.id != null) {
            return id.longValue() == other.id.longValue();
        }

        return this.getUuid().equals(other.getUuid());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (uuid == null ? 0 : uuid.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " ( uuid=" + uuid + ")";
    }

}
