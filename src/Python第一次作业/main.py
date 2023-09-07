from operater import add, sub, mul, div, mod


# 菜单
def menu():
    print("*******1.加************")
    print("*******2.减************")
    print("*******3.乘************")
    print("*******4.除************")
    print("*******5.模************")
    print("*******0.退出**********")


def main():

    while True:
        menu()
        options = int(input("请输入你的选择："))
        if options == 0:
            print("退出成功！")
            break
        try:
            num1 = int(input("请输入第一个数字："))
            num2 = int(input("请输入第二个数字："))
            if options == 1:
                print(f"相加的结果是{add(num1, num2)}")
            elif options == 2:
                print(f"相减的结果是{sub(num1, num2)}")
            elif options == 3:
                print(f"相乘的结果是{mul(num1, num2)}")
            elif options == 4:
                print(f"相除的结果是{div(num1, num2)}")
            elif options == 5:
                print(f"模的结果是{mod(num1, num2)}")
            else:
                print("输入错误，请重新输入")
        except BaseException:  # 异常处理
            print("输入类型不匹配")


if __name__ == "__main__":
    main()
