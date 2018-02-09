package org.codercats.mnr.db.repository;

import org.codercats.mnr.db.entities.Transportation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Venu Babu Kolla.
 */
@Repository
public interface TransportationRepository extends JpaRepository<Transportation, Long> {
}
