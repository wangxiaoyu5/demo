public class BubbleSort implements IAr raySort {

    @0verride
    
    public int[] sort(int[] sourceArra y) throws Exception{
    
    //对arr进行拷贝，不改变参数内容 int[] arr = Arrays. copyOf ( sourceArray, sourceArray. length) ;
    
    for(inti=1;i<arr.length; i++) {
    
    //设定一个标记，若为true,则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
    
    boolean flag = true;
    
          for(intj=0;j<arr.length - i; j++) {
    
            if (arr[j] > arr[j + 1]) {
    
            int tmp = arr[j]; arr[j ]」 = arr[j + 1 ];
    
            arr[j + 1] = tmp;
    
            flag = false;
            ｝
        ｝
    
    if (flag) {break;
    ｝
    
    return arr;
    ｝
｝
