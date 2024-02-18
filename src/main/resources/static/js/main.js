const fadeEls = document.querySelectorAll('.fade-in');
fadeEls.forEach(function (fadeEl, index) {
  gsap.to(fadeEl, 1, {
    delay: (index + 1) *.7,
    opacity: 1
  });
});

var map;
var button = document.getElementById('map');
button.addEventListener('click', changeCenter);

function initMap() {
  var user = { lat: 37.544149, lng: 127.043458 };
  map = new google.maps.Map( document.getElementById('map'), {
      zoom: 15,
      center: user
    });
  var MarkerPoint1 = { lat: 37.539636, lng: 127.052912};
  var Marker1 = new google.maps.Marker({
      position: MarkerPoint1,
      map: map,
      label: "이안힐텍소아청소년과의원",
    });
  var MarkerPoint2 = { lat: 37.537958, lng: 127.052435};
  var Marker2 = new google.maps.Marker({
    position: MarkerPoint2,
    map: map,
    label: "자애소아과의원",
  });
  var MarkerPoint3 = { lat: 37.537110, lng: 127.055164};
  var Marker3 = new google.maps.Marker({
    position: MarkerPoint3,
    map: map,
    label: "신소아과의원",
  });
  var MarkerPoint4 = { lat: 37.547552, lng: 127.054947};
  var Marker4 = new google.maps.Marker({
    position: MarkerPoint4,
    map: map,
    label: "성수연세소아청소년과의원",
  });
  var MarkerPoint5 = { lat: 37.551861, lng: 127.033179};
  var Marker5 = new google.maps.Marker({
    position: MarkerPoint5,
    map: map,
    label: "김지혜소아과의원",
  });
  var MarkerPoint6 = { lat: 37.553968, lng: 127.034115};
  var Marker6 = new google.maps.Marker({
    position: MarkerPoint6,
    map: map,
    label: "정소아청소년과의원",
  });
}