package Lab6;

public class Student{
    private int bal;
    private String name;
    public int[] IDNumber = {30,40,50,10,90};
    public Student(int bal, String name) {
        this.bal = bal;
        this.name = name;
    }
    public void InsertSort() {
        for (int left = 0; left < IDNumber.length; left++) {
            // Вытаскиваем значение элемента
            int value = IDNumber[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < IDNumber[i]) {
                    IDNumber[i + 1] = IDNumber[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            IDNumber[i + 1] = value;
        }
    }
    public void mergeArrays(Student[] a1, Student[] a2) {
        int[] a3 = new int[a1.length + a2.length];

        int i=0, j=0;
        for (int k=0; k<a3.length; k++) {

            if (i > a1.length-1) {
                int a = a2[j].bal;
                a3[k] = a;
                j++;
            }
            else if (j > a2.length-1) {
                int a = a1[i].bal;
                a3[k] = a;
                i++;
            }
            else if (a1[i].bal > a2[j].bal) {
                int a = a1[i].bal;
                a3[k] = a;
                i++;
            }
            else if (a1[i].bal < a2[j].bal) {
                int b = a2[j].bal;
                a3[k] = b;
                j++;
            }
        }
        System.out.print("[ ");
        for (int l = 0; l < a3.length; l++){
            System.out.print("[ id=");
            System.out.print(a3[l]);
            System.out.print(" ]");
        }
        System.out.print(" ]");
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[id=" + this.bal + ", name=" + this.name + "]";
    }



}
