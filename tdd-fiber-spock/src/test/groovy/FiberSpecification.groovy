import com.tdd.spock.FiberCalculator
import spock.lang.Specification
import spock.lang.Unroll


class FiberSpecification extends Specification {

    @Unroll
    def "斐波那契数列求和; 前#index项和 结果为:#sum"() {
        expect: "when + then 的组合"
        FiberCalculator.calculate(index)

        where: "表格方式测试不同分支逻辑"
        index || sum
        1     || 1L
        2     || 1L
        3     || 2L
        4     || 3L
        50    || 12586269025L
    }

}
