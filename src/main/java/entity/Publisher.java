package entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "publishers")
public class Publisher extends BasicEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "email")
    private String email;
    @Column(name = "dialing_code")
    private int dialingCode;
    @Column(name = "phone_number")
    private int phoneNumber;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;


}
