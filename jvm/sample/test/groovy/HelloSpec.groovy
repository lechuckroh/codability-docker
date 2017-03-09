import spock.lang.Specification

class HelloSpec extends Specification {
    void testGroovy() {
        when:
        def result = GroovyHello.hello("groovy")

        then:
        "Hello groovy" == result
    }

    void testJava() {
        when:
        def result = JavaHello.hello("java")

        then:
        "Hello java" == result
    }

    void testScala() {
        when:
        def result = ScalaHello.hello("scala")

        then:
        "Hello scala" == result
    }
}
