package task_1;

/**
 * У вас есть книжная полка, у каждой книги есть размер - количество страниц. Книжная полка представлена массивом, в котором хранятся размеры книг в порядке возрастания. Вам надо написать функцию, которая принимала бы этот массив размеров текущих книг, размер новой книги и вычисляла бы количество больших по размеру книг уже на полке. Требуемая алгоритмическая сложность: время O(log2n), дополнительная память O(1).
 *
 * Подумайте, как вы решили бы эту задачу, как достигли бы требуемой асимптотики.
 */

public class Main {
    public static void main(String[] args) {
        int[] bookshelf = {14, 16, 19, 32, 32, 32, 56, 69, 72};
        System.out.println(numberBookOnShelsf(bookshelf, 32));
    }

    public static int numberBookOnShelsf(int[] arr, int bookSize) {
        int left, right;
        int mid = 0;

        left = 0;
        right = arr.length - 1;

        while (left <= right) {
            mid = Math.round((right + left) / 2);
            if (arr[mid] <= bookSize && arr[mid + 1] > bookSize)
                return arr.length - (mid + 1);
            else if (arr[mid] > bookSize)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}
