package rlnitsua.tree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import rlnitsua.utils.node.TreeNode;
import rlnitsua.utils.node.TreeNodes;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BalancedBinaryTreeTest {
    private final TreeNode root;
    private final boolean res;

    public BalancedBinaryTreeTest(TreeNode root, boolean res) {
        this.root = root;
        this.res = res;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {TreeNodes.create(Arrays.asList(3,9,20,null,null,15,7)), true},
                {TreeNodes.create(Arrays.asList(1,2,2,3,3,null,null,4,4)), false},
                {null, true},
        });
    }

    @Test
    public void test() {
        BalancedBinaryTree demo = new BalancedBinaryTree();
        assertEquals(res, demo.isBalanced(root));
    }
}