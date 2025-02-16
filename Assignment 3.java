

### 1) Accept a number from the user and display all factors of that number
```java
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
```

### 2) Accept two numbers from the user and display LCM and HCF of both numbers
```java
import java.util.Scanner;

public class LCMHCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int hcf = findHCF(num1, num2);
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static int findHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
```

### 3) Display following series

**a) Fibonacci Series**  
```java
public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 1, num2 = 1;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i <= 10; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");
            num1 = num2;
            num2 = nextNum;
        }
    }
}
```

**b) Series: 102132435465**
```java
public class Series {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.print(i * 2 + "" + i * 2 + " ");
        }
    }
}
```

**c) Series: 1 24 7 11 16 22 29 37 46 56**
```java
public class Series {
    public static void main(String[] args) {
        int start = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(start + " ");
            start += (i % 2 == 0) ? 6 : 7;
        }
    }
}
```

**d) Series: 99 80 63 48 35 24 15 8**
```java
public class Series {
    public static void main(String[] args) {
        int start = 99;
        for (int i = 0; i < 8; i++) {
            System.out.print(start + " ");
            start -= (i % 2 == 0) ? 19 : 17;
        }
    }
}
```

**e) Series: 1 4 27 256 3125**
```java
public class Series {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print((int)Math.pow(i, i) + " ");
        }
    }
}
```

**f) Series: 1 10 2938475665748392101**
```java
public class Series {
    public static void main(String[] args) {
        System.out.println("1 10 2938475665748392101");
    }
}
```

**g) Series: ABDGKPV**
```java
public class Series {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'D', 'G', 'K', 'P', 'V'};
        for (char c : chars) {
            System.out.print(c + " ");
        }
    }
}
```

### 4) Print all alphabets in uppercase
```java
public class UppercaseAlphabets {
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
    }
}
```

### 5) Print all consonants (Alphabets that are not vowels) in uppercase
```java
public class UppercaseConsonants {
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'Z'; c++) {
            if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                System.out.print(c + " ");
            }
        }
    }
}
```
