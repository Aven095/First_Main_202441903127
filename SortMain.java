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
     * 选择排序
     * 功能：对整数数组进行升序排序
     * @param arr 待排序的int数组
     */
    public static void ljxSelectSort(int[] arr){
        int n = arr.length;
        //外层循环：确定每一轮要放最小值的位置
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            //内层循环：寻找最小值下标
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //交换最小值到i位置
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // ========== 程序入口main函数，统一测试入口 ==========
    public static void main(String[] args) {
        // 固定测试数组，所有人统一用这个数组测试
        int[] testArr = {9, 3, 7, 1, 5, 8, 2, 6, 4};
        System.out.print("原始测试数组: ");
        printArray(testArr);
        
        // ========== 组员在这里调用自己写的排序函数 ==========
        // 示例调用：zsBubbleSort(testArr);
        ljxSelectSort(testArr);
        System.out.print("选择排序后数组：");
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