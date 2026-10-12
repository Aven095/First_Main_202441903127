/**
 * 团队排序算法整合项目 - 初始框架
 * 项目名称: First_Main_202441903127
 * 开发规范: 遵循驼峰命名、注释完整、格式统一
 * 排序算法函数预留区域: 组内成员依次在下方添加自己的算法
 * 示例格式: public static void zsBubbleSort(int[] arr)
 * 示例：zs = 张三首字母，BubbleSort代表冒泡排序
 */
public class SortMain {
    // ========== 【组员在这里写自己的排序方法】==========
    // 插入排序
public static void lzkInsertSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        int temp = arr[i]; // 待插入元素
        int j;
        // 向前找位置，比temp大的元素往后挪
        for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
            arr[j + 1] = arr[j];
        }
        arr[j + 1] = temp; // 插入到正确位置
    }
}
    // 冒泡排序
    // 功能：对数字数组进行升序排序
    // 参数：arr - 待排序的数字数组
    // 返回值：无（直接修改原数组）
    public static void xzyBubbleSort(int[] arr) {
        int n = arr.length;
        // 外层循环：控制排序轮数
        for (int i = 0; i < n - 1; i++) {
            // 内层循环：控制每轮比较次数
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换相邻元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // 希尔排序
    // 功能：对数字数组进行升序排序
    // 参数：arr - 待排序的数字数组
    // 返回值：无（排序结果直接作用于原数组）
    public static void tlShellSort(int[] arr) {
        int n = arr.length;
        // 外层循环：增量gap从数组长度的一半开始，每轮减半，直到1
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // 中层循环：从gap位置开始，对间隔为gap的子序列执行插入排序
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                // 内层循环：把当前元素移动到子序列中的正确位置
                while (j - gap >= 0 && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                // 插入到正确位置
                arr[j] = temp;
            }
        }
    }

    // ========== 程序入口main函数，统一测试入口 ==========
    public static void main(String[] args) {
        // 固定测试数组，所有人统一用这个数组测试
        int[] testArr = {9, 3, 7, 1, 5, 8, 2, 6, 4};
        System.out.print("原始测试数组: ");
        printArray(testArr);

        // ========== 组员在这里调用自己写的排序函数 ==========
        lzkInsertSort(testArr);
        System.out.print("插入排序后数组: ");
        printArray(testArr);
        // 示例调用：zsBubbleSort(testArr);
        // 调用自己的排序算法：肖尊毅-冒泡排序
        xzyBubbleSort(testArr);
        System.out.print("肖尊毅-冒泡排序算法排序结果: ");
        printArray(testArr);
        // 调用自己的排序算法：汤李-希尔排序
        tlShellSort(testArr);
        System.out.print("汤李-希尔排序算法排序结果: ");
        printArray(testArr);

    }

    // 辅助工具：打印数组，方便看排序结果，所有人共用
    public static void printArray(int[] arr) {
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}