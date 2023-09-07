def add(num1: int, num2: int) -> int:  # 加法
    return num1 + num2


def sub(num1: int, num2: int) -> int:  # 减法
    return num1 - num2


def mul(num1: int, num2: int) -> int:  # 乘法
    return num2 * num1


def div(num1: int, num2: int) -> int:  # 除法
    if num2 == 0:
        print("除数不能为0")
    else:
        return num1 / num2


def mod(num1: int, num2: int) -> int:  # 模
    return num1 % num2
