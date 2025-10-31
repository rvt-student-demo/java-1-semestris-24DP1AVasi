package rvt;

public class Statistics {
    private int count;
    private int sum;
    private int odd;
    private int even;

    public Statistics() {
        count = 0;
        sum = 0;
        odd = 0;
        even = 0;
    }

    public void addNumber(int number) {
        count++;
        sum += number;
        if (number % 2 == 0) {
            even++;
        } else {
            odd++;
        }
    }

    public int getCount() {
        return count;
    }

    public int getSum() {
        return sum;
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        } else {
            return (double) sum / count;
        }
    }

    public int getOdd() {
        return odd;
    }

    public int getEven() {
        return even;
    }
}