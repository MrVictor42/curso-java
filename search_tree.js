const tree = {}
function insert(tree, value) {
  if (tree.value) {
    if (value > tree.value) {
      insert(tree.right, value)
    } else {
      insert(tree.left, value)
    }
  } else {
    tree.value = value
    tree.right = {}
    tree.left = {}
  }
}
insert(tree, 10)
// console.log(arvore)
insert(tree, 11)
// console.log(arvore)
insert(tree, 9)
// console.log(arvore)
insert(tree, 8)
// console.log(arvore)

function search(tree, value) {
    if(!tree.value || tree.value === value) {
        return tree.value;
    }
    if(value < tree.value) {
        return search(tree.left, value)
    } else {
        return search(tree.right, value)
    }
}

console.log(search(tree, 14))