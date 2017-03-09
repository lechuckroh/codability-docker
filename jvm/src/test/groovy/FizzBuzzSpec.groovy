import spock.lang.Specification

class FizzBuzzSpec extends Specification {
    private static List<String> solve(int start, int end, int num1, int num2) {
        (start..end).collect { i ->
            def b1 = i % num1 == 0
            def b2 = i % num2 == 0
            if (b1 && b2) {
                'FizzBuzz'
            } else if (b1) {
                'Fizz'
            } else if (b2) {
                'Buzz'
            } else {
                i.toString()
            }
        }
    }

    void test01() {
        when:
        def expected = solve(1, 15, 3, 5)
        def actual = FizzBuzz.fizzBuzz(1, 15)

        then:
        expected == actual.toList()
    }
}
