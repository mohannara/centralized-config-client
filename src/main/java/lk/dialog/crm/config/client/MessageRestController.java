package lk.dialog.crm.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mohan_02392
 *
 */

@RefreshScope
@RestController
public class MessageRestController {

	@Value("${ocs-http.gsm-dbn.url:Unable to connect to config server}")
	private String url;

	@RequestMapping("/server/url")
	String getURL() {
		return this.url;
	}

}
