

function addProduct() {
window.location.href = 'add-product.html';
}

function viewDetails(id) {
window.location.href = 'details.html?id=' + id;
}

function editProduct(id) {
window.location.href = 'edit-product.html?id=' + id;
}








    const button = document.getElementById('addBtn0');
    const div0 = document.getElementById('Identifier0');

 let products = JSON.parse(localStorage.getItem("products") || "[]");
function renderProducts() {
div0.innerHTML = '';

products.forEach((p) => {
const ele0 = document.createElement('div');
ele0.className = "product-card"
ele0.innerHTML = `
<div class = "img-box"  ><img src="${p.image || 'assets/no-image.png'}" alt="${p.name}"></div>

<div class = "card-body"  >
<h3 >${p.name}</h3>
<p class = "desc"  >${p.description}</p></div>

<div class = "card-actions"  >
<button class = "details-btn"  onclick="viewDetails(${p.id})">Details</button>
<button class = "details-btn"  onclick="editProduct(${p.id})">Edit</button></div>
`;
div0.appendChild(ele0);
});
}
button.addEventListener('click', addProduct);
renderProducts();
   


