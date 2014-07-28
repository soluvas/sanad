
var buttons = require('sdk/ui/button/action');
var tabs = require('sdk/tabs');
var self = require('sdk/self');

var button = buttons.ActionButton({
  id: 'check-sanad',
  label: 'Check Sanad',
  icon: {
	'16': './cloud-16.png',
	'32': './cloud-32.png',
	'64': './cloud-64.png',
  },
  onClick: handleClick
});

function handleClick(state) {
//   tabs.open('http://www.hendyirawan.com/');
//   console.debug('Attaching', self.data.url('content-assistant.js'), 'to', tabs.activeTab);
  tabs.activeTab.attach({
	contentScriptFile: [ self.data.url('jquery-2.1.1.min.js'), self.data.url('content-assistant.js') ]
  });
}
