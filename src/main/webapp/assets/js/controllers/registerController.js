(function(eaApp, angular, $) {
	'use strict';

	eaApp.controller('registerController', function($scope, registerService, accessibilityItems, categories) {
		$scope.showAddNewItem = false;

		$scope.accessibilityItems = accessibilityItems.data;

		$scope.categories = categories.data;

		$scope.obj = {
			accessibilityItem: []
		};
		$scope.newItem = {
			categories: []
		}

		$scope.cancelAddNewItem = function() {
			$scope.showAddNewItem = false;

			$scope.newItem = {
				categories: []
			};

			var i;
			for(i=0; i<$scope.categories.length; i++) {
				$scope.categories[i].checked = false;
			}
		};
		$scope.displayAddNewItem = function() {
			$scope.showAddNewItem = true;
		};

		$scope.cancelAddCategory = function() {
			$scope.showAddCategory = false;

			$scope.newItem.newCategory = "";
		};
		$scope.displayAddCategory = function() {
			$scope.showAddCategory = true;
		};

		$scope.handleNewItem = function(item) {
			if(item.checked) {
				$scope.obj.accessibilityItem.push({
					accessibility: item
				});
			}
			else {
				$scope.removeItem(item.name);
			}
		};
		$scope.handlerCategory = function(category) {
			if(category.checked) {
				$scope.newItem.categories.push(category);
			}
			else {
				$scope.removeCategory(category);
			}
		};

		$scope.removeCategory = function(category) {
			var i = $scope.newItem.categories.length;

			while(i--) {
				if($scope.newItem.categories[i] == category) {
					$scope.newItem.categories.splice(i, 1);
				}
			}
		};

		$scope.removeItem = function(name) {
			var i = $scope.obj.accessibilityItem.length;

			while(i--) {
				if($scope.obj.accessibilityItem[i].accessibility.name == name) {
					$scope.obj.accessibilityItem.splice(i, 1);
				}
			}
		};

		$scope.addNewItem = function() {
			registerService.addNewItem($scope.newItem).success(function(data) {
				var item = {
					name: $scope.newItem.name,
					checked: true
				};

				$scope.accessibilityItems.unshift(item);
				$scope.handleNewItem(item);

				$scope.cancelAddNewItem();
			});
		};

		$scope.addCategory = function() {
			registerService.addCategory({name: $scope.newItem.newCategory}).success(function(data) {

				$scope.categories.unshift({
					name: $scope.newItem.newCategory,
					checked: true
				});

				$scope.cancelAddCategory();
			});
		};

		$scope.addEstablishment = function() {
			var i;

			for(i=0; i<$scope.obj.accessibilityItem.length; i++) {
				$scope.obj.accessibilityItem[i].grade = $scope.obj.accessibilityItem[i].accessibility.grade;
			}
			registerService.addEstablishment($scope.obj).success(function(data) {

				$scope.categories.unshift({
					name: $scope.newItem.newCategory,
					checked: true
				});

				$scope.cancelAddCategory();
			});
		}
	});

})(angular.module('eaApp'), window.angular, window.jQuery);