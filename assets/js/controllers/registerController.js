(function(eaApp, angular, $) {
	'use strict';

	eaApp.controller('registerController', function($scope) {
		$scope.cancelAddNewItem = function() {
			$scope.showAddNewItem = false;
		};
		$scope.showAddNewItem = function() {
			$scope.showAddNewItem = true;
		};
	});

})(angular.module('eaApp'), window.angular, window.jQuery);