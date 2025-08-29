
 let products = JSON.parse(localStorage.getItem("products") || "[]");
 function getProductIdFromUrl() {
 const params = new URLSearchParams(window.location.search);
 return Number(params.get("id")); } 

const id = getProductIdFromUrl();
const product = products.find(p => p.id === id);

function goBack() {
window.location.href = "index.html";
}








 const div0 = document.getElementById('Identifier0');

function renderDetails(product) {
div0.innerHTML = `

<button class = "back-btn"  onclick="goBack(${null})">Back</button>

<div class = "details-card"  >
<div class = "image-box"  ><img src="${product.image || 'assets/no-image.png'}" alt="${product.name}"></div>
<div class = "info-box"  >
<h2 >${product.name}</h2>
<p class = "price"  >${product.price}</p>
<p class = "description"  >${product.description}</p></div></div>
`;
}
renderDetails(product);
  


