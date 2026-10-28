
//Array 2 conite
//lucky13
public boolean lucky13(int[] nums) {
    for (int num : nums) {
        if (num == 1 || num == 3) {
            return false;
        }
    }
    return true;
}

void main() {
}
//sum28
public boolean sum28(int[] nums) {
    int sum = 0;
    for (int num : nums) {
        if (num == 2) {
            sum += 2;
        }
    }
    return sum == 8;
}
// more 14
public boolean more14(int[] nums) {
    int count1 = 0;
    int count4 = 0;
    for (int num : nums) {
        if (num == 1) count1++;
        if (num == 4) count4++;
    }
    return count1 > count4;
}
//fiz array
public int[] fizzArray(int n) {
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
        result[i] = i;
    }
    return result;
}
//only14
public boolean only14(int[] nums) {
    for (int num : nums) {
        if (num != 1 && num != 4) {
            return false;
        }
    }
    return true;
}
//fizarray2
public String[] fizzArray2(int n) {
    String[] result = new String[n];
    for (int i = 0; i < n; i++) {
        result[i] = String.valueOf(i);
    }
    return result;
}
//no14
public boolean no14(int[] nums) {
    boolean has1 = false;
    boolean has4 = false;
    for (int num : nums) {
        if (num == 1) has1 = true;
        if (num == 4) has4 = true;
    }
    return !has1 || !has4;
}
//isanywhre
public boolean isEverywhere(int[] nums, int val) {
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] != val && nums[i + 1] != val) {
            return false;
        }
    }
    return true;
}
//either24
public boolean either24(int[] nums) {
    boolean has22 = false;
    boolean has44 = false;

    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == 2 && nums[i + 1] == 2) has22 = true;
        if (nums[i] == 4 && nums[i + 1] == 4) has44 = true;
    }

    return has22 ^ has44;
}