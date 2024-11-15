package entitys;

import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-14T18:49:45", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(reservation.class)
public class reservation_ { 

    public static volatile SingularAttribute<reservation, Integer> total;
    public static volatile SingularAttribute<reservation, Long> id_Passenger;
    public static volatile SingularAttribute<reservation, Date> date_Chek_Out;
    public static volatile SingularAttribute<reservation, Long> passenger;
    public static volatile SingularAttribute<reservation, Integer> seña;
    public static volatile SingularAttribute<reservation, Long> id;
    public static volatile SingularAttribute<reservation, List> list_Rooms;
    public static volatile SingularAttribute<reservation, Date> date_Check_In;

}