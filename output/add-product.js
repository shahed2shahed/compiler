











    let products = JSON.parse(localStorage.getItem("products") || "[]");
let fileDataUrl = null;
 const form0 = document.getElementById('formProduct0');
form0.addEventListener("submit", (e) => {
e.preventDefault();
       const name0 = document.getElementById('name').value.trim();
    const price0 = document.getElementById('price').value;
const description0 = document.getElementById('description').value;
if (!name0) {
alert("Product name is required!");
  return;}
 const newId = products.length > 0
? Math.max(...products.map(p => p.id || 0)) + 1
: 1;
const newProduct = {
 id: newId,
name : name0 , price : price0 , description : description0 , image : fileDataUrl  };
products.push(newProduct);
localStorage.setItem("products", JSON.stringify(products));
window.location.href = "index.html";
});
       const input0 = document.getElementById('imageInput');
input0.addEventListener("change", (event) => {
const file= event.target.files[0 ];
if (!file) return;
const reader = new FileReader ();
reader.onload =()=> { 
fileDataUrl = reader.result;
};
reader.readAsDataURL(file );
});
       


