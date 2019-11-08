package top.itning.smp.smpinfo.server;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.itning.smp.smpinfo.dto.StudentUserDTO;

/**
 * @author itning
 */
public interface UserService {
    /**
     * 获取所有用户
     *
     * @param pageable 分页信息
     * @return 用户
     */
    Page<StudentUserDTO> getAllUser(Pageable pageable);
}
