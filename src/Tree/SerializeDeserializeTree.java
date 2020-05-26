package Tree;


// Serialization is the process of converting a data structure or object into a sequence of bits
// so that it can be stored in a file or memory buffer, or transmitted across a network connection
// link to be reconstructed later in the same or another computer environment.

//You may serialize the following tree:
//
//    1
//   / \
//  2   3
//     / \
//    4   5
//
//as "[1,2,3,null,null,4,5]"

import java.util.ArrayList;
import java.util.Arrays;

public class SerializeDeserializeTree {
    public String serialize(TreeNode root) {
        return preSer(root, ""); // do preorder traversal
    }

    public String preSer(TreeNode node, String ser){
        if(node == null){
            ser += "null,";
        } else{
            ser += String.valueOf(node.val) + ",";
            ser = preSer(node.left, ser);
            ser = preSer(node.right, ser);
        }

        return ser;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(data.split(",")));
        return preDeser(list);
    }

    public TreeNode preDeser(ArrayList<String> list){
        if(list.get(0).equals("null")){
            list.remove(0);
            return null;
        }


        TreeNode node = new TreeNode(Integer.parseInt(list.get(0)));
        list.remove(0);
        node.left = preDeser(list);
        node.right = preDeser(list);

        return node;
    }
}
