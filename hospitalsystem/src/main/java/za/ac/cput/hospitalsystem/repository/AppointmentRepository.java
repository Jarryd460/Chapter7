package za.ac.cput.hospitalsystem.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.hospitalsystem.domain.Appointment;

/**
 * Created by student on 2015/05/18.
 */
public interface AppointmentRepository extends CrudRepository<Appointment,Long> {
}
