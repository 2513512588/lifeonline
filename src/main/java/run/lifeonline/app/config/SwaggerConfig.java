package run.lifeonline.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author HHY
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig{

    @Bean
    public Docket webApi(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("lifeonline")
                   .apiInfo(new ApiInfoBuilder()
                           .title("lifeonline在线文档")
                           .description("lifeonline的Api文档")
                           .version("1.0")
                           .build()
                   );
    }

}
