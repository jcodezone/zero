package deep.sys.svc;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import deep.sys.bean.Role;

public interface RoleRepo extends JpaRepository<Role, Long>{
	
}
