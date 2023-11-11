public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,3,4,5,7,9,10,12,16,18,20,21,24,27,32};
        int searchElement=10;
        int first=0,last=arr.length;
        int index=binarySearch(arr,searchElement ,first,last);
        System.out.println("Element : "+searchElement+" find at position index : "+index);
        System.out.println(arr[index]);
    }
    static int binarySearch(int []arr,int searchElement,int first,int last){
        int mid=(first+last)/2;
        if(searchElement==arr[mid]){
            return mid;
        }
        else if (searchElement>arr[mid]){
            first=mid+1;
            return binarySearch(arr, searchElement, first, last);
        }
        else if(searchElement<arr[mid]){
            last =mid-1;
            return binarySearch(arr, searchElement, first, last);
        }
        return -1;
    }
}
