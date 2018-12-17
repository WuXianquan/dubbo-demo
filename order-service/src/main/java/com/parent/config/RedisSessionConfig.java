package com.parent.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @Auther: Lon
 * @Date: 2018/11/12 16:42
 * @Description:
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}
