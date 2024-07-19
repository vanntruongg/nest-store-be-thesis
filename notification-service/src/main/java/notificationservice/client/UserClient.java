package notificationservice.client;

import notificationservice.common.CommonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "identity-service", url = "http://localhost:9001/internal/identity")
public interface UserClient {
  @GetMapping("/user/existed")
  ResponseEntity<CommonResponse<Object>> existedUserByEmail(@RequestParam("email") String email);
}
