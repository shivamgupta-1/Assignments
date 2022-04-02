package springCore.Q6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
@PropertySource(value = { "classpath:applicationQ6.properties" })
public class Dbconfiguration {

	@Value(value = "${db.name}")
	private String driverName;
	@Value(value = "${db.url}")
	private String dburl;

	@Autowired
	Environment environment;


	public void Dbconfiguration() {
		System.out.println(driverName);
		System.out.println(dburl);
		System.out.println(environment.getProperty("db.user"));
		System.out.println(environment.getProperty("db.password"));
	}

}
