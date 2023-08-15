package com.example.classifiedhandler.domain.entity;

import com.example.classifiedhandler.domain.appEnums.Gender;

import com.example.classifiedhandler.domain.appEnums.PriceMode;
import com.example.classifiedhandler.domain.appEnums.SmokeEnum;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "user_posts")
public class UserPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String userId;
    private String userName;
    private LocalDateTime datePosted;
    private String stayOrLeaseType;

    @Column(name = "available_from")
    private LocalDate availableFrom;

    @Column(name = "available_to")
    private LocalDate availableTo;

    private String zip;
    private int accommodates;
    private boolean attachedBath;

    @Enumerated(EnumType.STRING)
    private Gender preferredGender;

    private BigDecimal expectedRent;
    private Boolean isPriceNegotiable;


    /*
    *   PER_MONTH("Per Month"),
    PER_NIGHT("Per Night"),
    PER_DAY("Per Day"),
    PER_WEEK("Per Week");
    * */
    private String priceMode;

    private BigDecimal deposit;
    private Integer propertySize;
    private String roomType;

    @ElementCollection
    private List<String> amenities;

    private String vegOrNon_VegOrBoth;

    private Boolean isSmokeAllowed;

    private String petFriendly;


    private String contactName;
    private String businessName;
    private String businessCity;
    private String businessAddress;
    private String email;


    private String couponCode;

    private String firstName;
    private String lastName;
    private String emailContact;
    private String confirmEmail;
    private String address;
    private String zipContact;
    private String city;
    private String state;
    private String country;

    // Getters and setters, constructors, other methods

    // Enums Gender, PriceMode, SmokeEnum, and other related classes should be defined appropriately

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        UserPost userPost = (UserPost) o;
        return getPostId() != null && Objects.equals(getPostId(), userPost.getPostId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}

