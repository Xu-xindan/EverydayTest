import java.util.ArrayList;
import java.util.List;
/*
* 遍历从0--n-1 依次在已有的中加上遍历元素
* */
public class sonn {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int all = res.size();
            for (int j = 0; j < all; j++) {
                List<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }
}
