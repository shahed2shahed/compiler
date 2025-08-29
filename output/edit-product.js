const productconst const fileDataUrlconst 

 let products = JSON.parse(localStorage.getItem("products") || "[]");
 function getProductIdFromUrl() {
 const params = new URLSearchParams(window.location.search);
 return Number(params.get("id")); } 











   let products = JSON.parse(localStorage.getItem("products") || "[]");
let fileDataUrl = null;
 const form0 = document.getElementById('formProduct0');
const price0 = document.getElementById('price').value;
       const name0 = document.getElementById('name').value.trim();
    const price0 = document.getElementById('price').value;
const description0 = document.getElementById('description').value;
       const input0 = document.getElementById('imageInput');
input0.addEventListener("change", (event) => {
const file= event.target.files[0 ];
if (!file) return;
const reader = new FileReader ();
reader.onload =()=> { 
fileDataUrl = reader.result;
this.product.image : Url0
};
reader.readAsDataURL(file );
});
       


