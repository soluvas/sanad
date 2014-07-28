var $ = jQuery.noConflict();

console.log('Content assistant attached');
// document.body.style.border = '5px solid red';

var sanads = {
  'taqobbalallahu minna wa minkum': {verdict: 'good', reason: ''},
  'taqabbalallahu minna wa minkum': {verdict: 'good', reason: ''},
  'taqobalallahu minna wa minkum': {verdict: 'warning', reason: 'perhatikan ba dobel: taqoBBalallahu'},
  'taqabalallahu minna wa minkum': {verdict: 'warning', reason: 'perhatikan ba dobel: taqoBBalallahu'},
  'taqobballahu minna wa minkum': {verdict: 'bad', reason: 'yang benar taqobbalallahu'},
  'taqabballahu minna wa minkum': {verdict: 'bad', reason: 'yang benar taqobbalallahu'},
  'taqoballahu minna wa minkum': {verdict: 'bad', reason: 'yang benar taqobbalallahu'},
  'taqaballahu minna wa minkum': {verdict: 'bad', reason: 'yang benar taqobbalallahu'},
  'minal aidin wal faizin': {verdict: 'good', reason: '\'aidin dibaca العائدين lho ya'},
  'minal aidin wal faidzin': {verdict: 'bad', reason: 'faizin ditulis الفائزين'},
  'minal aidin wal faidin': {verdict: 'bad', reason: 'faizin ditulis الفائزين'},
  'minal aidzin wal faizin': {verdict: 'bad', reason: 'aidin ditulis العائدين'},
  'minal aidzin wal faidzin': {verdict: 'bad', reason: 'aidin ditulis العائدين'},
  'minal aidzin wal faidin': {verdict: 'bad', reason: 'aidin ditulis العائدين'},
  'minal aizin wal faizin': {verdict: 'bad', reason: 'aidin ditulis العائدين'},
  'minal aizin wal faidzin': {verdict: 'bad', reason: 'aidin ditulis العائدين'},
  'minal aizin wal faidin': {verdict: 'bad', reason: 'aidin ditulis العائدين'},

  'minal aidin walfaizin': {verdict: 'good', reason: '\'aidin dibaca العائدين lho ya'},
  'minal aidin walfaidzin': {verdict: 'bad', reason: 'faizin ditulis الفائزين'},
  'minal aidin walfaidin': {verdict: 'bad', reason: 'faizin ditulis الفائزين'},
  'minal aidzin walfaizin': {verdict: 'bad', reason: 'aidin ditulis العائدين'},
  'minal aidzin walfaidzin': {verdict: 'bad', reason: 'aidin ditulis العائدين'},
  'minal aidzin walfaidin': {verdict: 'bad', reason: 'aidin ditulis العائدين'},
  'minal aizin walfaizin': {verdict: 'bad', reason: 'aidin ditulis العائدين'},
  'minal aizin walfaidzin': {verdict: 'bad', reason: 'aidin ditulis العائدين'},
  'minal aizin walfaidin': {verdict: 'bad', reason: 'aidin ditulis العائدين'},

};

var pars = $('p');
console.log('paragraphs:', pars);
pars.each(function(idx, it) {
  var p = $(it);
  var canonicalized = p.text().toLowerCase().replace(/[^a-z0-9 ]+/, '')
	.replace(/\s+/, ' ').trim();
  console.log('checking', canonicalized);
  var currentAnn = null;
  for (var sanadKey in sanads) {
	if (canonicalized.contains(sanadKey)) {
	  if (currentAnn == null || currentAnn.verdict == 'good') {
		currentAnn = sanads[sanadKey];
		if (currentAnn.verdict == 'bad') {
		  // for bad, let go
		  break;
		}
	  }
	}
  }
  if (currentAnn != null) {
	console.log('Annotation for', it, canonicalized, 'is', currentAnn);
	switch (currentAnn.verdict) {
	  case 'good':
		p.css('background-color', 'lightgreen');
		p.append($('<abbr>').css('color', 'green').text(' ✔ ').attr('title', currentAnn.reason));
		break;
	  case 'warning':
		p.css('background-color', 'yellow');
		p.append($('<abbr>').css('color', 'orange').text(' ❗ ').attr('title', currentAnn.reason));
		break;
	  case 'bad':
		p.css('background-color', 'red');
		p.append($('<abbr>').css('color', 'red').text(' ✖ ').attr('title', currentAnn.reason));
		break;
	  default:
		console.log('ERROR: Unknown verdict:', currentAnn.verdict);
	}
  }
});
