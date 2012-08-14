import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.TRACE
import static ch.qos.logback.classic.Level.WARN

appender("STDOUT", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
  }
}
logger("org.hibernate", WARN)
logger("org.jboss", WARN)
logger("org.springframework", WARN)
logger("org.springframework.data.jpa.repository.support.SimpleJpaRepository", DEBUG)
root(TRACE, ["STDOUT"])
