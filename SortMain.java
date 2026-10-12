/**
 * 团队排序算法整合项目 - 初始框架
 * 项目名称: First_Main_202441903127
 * 开发规范: 遵循驼峰命名、注释完整、格式统一
 * 排序算法函数预留区域: 组内成员依次在下方添加自己的算法
 * 示例格式: public static void zsBubbleSort(int[] arr)
 * 示例：zs = 张三首字母，BubbleSort代表冒泡排序
 */
public class SortMain {
    /**
     * 快速排序【对外调用入口方法，main调用这个】
     * 功能：对int类型数组进行升序快速排序
     * 参数：arr - 待排序的整数数组
     */
    public static void pqQuickSort(int[] arr) {
        quickSortRecursion(arr, 0, arr.length - 1);
    }

    /**
     * 快速排序递归子方法（内部辅助）
     * @param arr 待排序数组
     * @param left 左边界下标
     * @param right 右边界下标
     */
    private static void quickSortRecursion(int[] arr, int left, int right) {
        // 递归终止条件：左边界 >= 右边界，区间只有一个元素或者空，不用排序
        if (left >= right) {
            return;
        }
        // 选取基准元素
        int pivot = arr[left];
        int i = left;
        int j = right;

        while (i < j) {
            // 从右边往左找，找到比基准小的元素
            while (i < j && arr[j] >= pivot) {
                j--;
            }
            arr[i] = arr[j];
            // 从左边往右找，找到比基准大的元素
            while (i < j && arr[i] <= pivot) {
                i++;
            }
            arr[j] = arr[i];
        }
        // 把基准放到最终正确位置
        arr[i] = pivot;

        // 递归处理基准左边、右边子区间
        quickSortRecursion(arr, left, i - 1);
        quickSortRecursion(arr, i + 1, right);
    }


    // ========== 程序入口main函数，统一测试入口 ==========
    public static void main(String[] args) {
        // 固定测试数组，所有人统一用这个数组测试
        int[] testArr = {9, 3, 7, 1, 5, 8, 2, 6, 4};
        System.out.print("原始测试数组: ");
        printArray(testArr);

        // ========== 组员在这里调用自己写的排序函数 ==========
        // 示例调用：zsBubbleSort(testArr);
        pqQuickSort(testArr);
        System.out.print("快速排序后数组: ");
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