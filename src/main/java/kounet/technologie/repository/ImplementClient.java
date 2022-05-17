package kounet.technologie.repository;

import ch.qos.logback.core.net.server.Client;
import kounet.technologie.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImplementClient extends JpaRepository<Clients,Long> {
}
