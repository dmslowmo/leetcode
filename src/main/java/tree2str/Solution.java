package main.java.tree2str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Solution {
    public String tree2str(TreeNode t) {
        if (t == null) return "()";
        if (t.left == null && t.right == null) return "(" + t.val + ")";

        return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
    }

    public TreeNode makeTree(Integer[] nodes) {
        if (nodes.length == 0) return null;
        TreeNode treeNode = null;
        Map<Integer, List<Integer>> tree = new HashMap<>();
        int layer = 0;
        int index = 0;
        int range = (int) (index + Math.pow(2, layer));
        while (index <= nodes.length) {
            List<Integer> layerNodes = new ArrayList<>();
            for (int i = index; i < range; i++) {
                layerNodes.add(nodes[i]);
                if (i + 1 == nodes.length) {
                    break;
                }
            }
            System.out.println(layerNodes);
            tree.put(layer, layerNodes);
            index = range;
            layer++;
            range = (int) (index + Math.pow(2, layer));
        }
        //TODO: make TreeNode for each element
        int j = 0;
        for (int i = 0; i < tree.size() - 1; i++) {
            if (i == 0) {
                treeNode = new TreeNode(tree.get(i).get(j));
            }
        }
        return treeNode;
    }
}
