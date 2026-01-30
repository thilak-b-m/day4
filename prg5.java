public class prg5 {
    public static int add(int a, int b){
        return a+b;
    }
    
    public static double add(double a, double b){
        return a;
    }

    public static void main(String[] args) {
        int a = 4;
        int b =5;
        int sum = add(a,b);
        double c = 6.7;
        double sum1 = add(a,c);
        System.out.println("sum = "+sum);
        System.out.println("sum = "+sum1);
    }
}

if __name__ == '__main__':
    s = input()
    a1 = True
    for i in range(len(s)):
        if s[i].isalpha() or s[i].isnumeric():
            print(True)
            break
        if a1:
            continue
        else:
            print(False)
    a=True
    for i in range(len(s)):
        if s[i].isalpha():
            print(True)
            break
        if a:
            continue
        else:
            print(False)
    b=True
    for i in range(len(s)):
        if s[i].isdigit():
            print(b)
            break
        if b:
            continue
        else:
            print(False)
    c=True    
    for i in range(len(s)):
        if s[i].islower():
            print(True)
            break
        if c:
            continue
        else:
            print(False)
    d=True   
    for i in range(len(s)):
        if s[i].isupper():
            print(True)
            break
        if d:
            continue
        else:
            print(False)
